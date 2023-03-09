// Internal DSL I think

import picolib._
import picolib.maze._
import picolib.semantics._
import java.io.File
import scala.util.parsing.combinator._


trait Line
// class Lines extends Line 


def MakeDirection(direction: String): MoveDirection = {
  var returnedDirection = direction match {
    case "north" => North 
    case "North" => North
    case  "N" => North
    case "n" => North
    case "south" => South
    case  "South" => South 
    case "S" => South 
    case "s" => South
    case "east" => East
    case "East" => East 
    case "E" => East 
    case "e" => East
    case "west" => West 
    case "West" => West 
    case "W" => West 
    case "w" => West
  }
  return returnedDirection
}

def MakeSurroundings(north: String, east: String, west: String, south: String): Surroundings = {
  var returnedNorth = north match {
    case "north" => Blocked
    case "North" => Blocked 
    case "N" => Blocked
    case "n" => Blocked
    case "*" => Anything
    case "Any" => Anything
    case "any" => Anything
    case "x" => Open
    case "X" => Open
    case "Empty" => Open
    case "empty" => Open
  }

  var returnedSouth = south match {
    case "south" => Blocked
    case "South" => Blocked
    case "S" => Blocked
    case "s" => Blocked
    case "*" => Anything 
    case "Any" => Anything
    case "any" => Anything
    case "x" => Open
    case "X" => Open 
    case "Empty" => Open
    case "empty" => Open
  }

  var returnedEast = east match {
    case "east" => Blocked
    case "East" => Blocked 
    case "E" => Blocked 
    case "e" => Blocked
    case "*" => Anything 
    case "Any" => Anything 
    case "any" => Anything
    case "x" => Open 
    case "X" => Open 
    case "Empty" => Open 
    case "empty" => Open
  }

  var returnedWest = west match {
    case "west" => Blocked
    case "West" => Blocked
    case  "W" => Blocked 
    case "w" => Blocked
    case "*" => Anything 
    case "Any" => Anything
    case "any" => Anything
    case "x" => Open 
    case "X" => Open 
    case "Empty" => Open 
    case "empty" => Open
  }
  return Surroundings(returnedNorth, returnedEast, returnedWest, returnedSouth)
}



def MakeRule (startState: String, north: String, east: String, west: String, south: String, direction: String, endState: String): Rule = {
  var surroundings = MakeSurroundings(north, east, west, south)
  var moveDirection = MakeDirection(direction)
  return Rule(State(startState), surroundings, moveDirection, State(endState))
}


// Case1: "from" "in" "to" "in"
// Case2: "from" "in" "to"

object MyParser extends JavaTokenParsers with PackratParsers {
  lazy val line: PackratParser [Rule] =
    "from" ~ ident ~ "in" ~ ident ~ ident ~ ident ~ ident ~ "to" ~ ident ~ "in" ~ ident ^^ {case "from" ~ startState ~ "in" ~ north ~ east  ~ west ~ south ~ "to" ~ direction ~ "in" ~ endState => MakeRule (startState,north,east,west,south,direction, endState) }
    | "from" ~ ident ~ "in" ~ ident ~ ident ~ ident ~ ident ~ "to" ~ ident ^^ {case "from" ~ startState ~ "in" ~ north ~ east  ~ west ~ south ~ "to" ~ direction => MakeRule (startState,north,east,west,south,direction, startState) }

  // lazy val lines:PackratParser [Rule] = 
  //   rep(line) ^^ {case (picolib.semantics.Rule) => rep(line)}
  }
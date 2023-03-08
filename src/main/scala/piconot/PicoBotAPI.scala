// Internal DSL I think

import picolib._
import picolib.maze._
import picolib.semantics._
import java.io.File

/** This is an intentionally bad internal language, but it uses all the parts of
  * the picolib library that you might need to implement your language
  */

val emptyMaze = Maze("resources" + File.separator + "empty.txt")

def from(startState:String, returnedSet:Set): Rule =
    Rule(State(startState), )


def in(north:String, east:String, west:String, south:String, toContents:Function): Set(Surroundings, State) =

def to(direction:String, endState:String): Set(MoveDirection, State) = 

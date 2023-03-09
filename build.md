# Building and running Piconot

The instructions should be...

run sbt
run console
run import MyParser._
run import picolib._
then run parseAll(line, [YOUR RULE HERE])

the rule you pass in will be a string, which will follow the general structure:
"from [start state name] in [north state] [east state] [west state] [south state] to [direction]"
with an optional state change:
"from [start state name] in [north state] [east state] [west state] [south state] to [direction] in [end state name]".

For instance, making a rule that changes from the state startState to endState, moving in the North direction when there is open space on the north side, any space on the east and west side, and a wall on the south side:

"from startState in Empty Any Any South to North in endState"

this can also be rewritten using shorter picobot syntax,

"from startState in X * * S to N in endState"

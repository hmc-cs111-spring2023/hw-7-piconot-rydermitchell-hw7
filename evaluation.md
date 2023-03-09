# Evaluation: running commentary

## Internal DSL

_Describe each change from your ideal syntax to the syntax you implemented, and
describe_ why _you made the change._

**On a scale of 1–10 (where 10 is "a lot"), how much did you have to change your syntax?**

**On a scale of 1–10 (where 10 is "very difficult"), how difficult was it to map your syntax to the provided API?**

## External DSL

_Describe each change from your ideal syntax to the syntax you implemented, and
describe_ why _you made the change._

I didn't make that many changes from my ideal syntax. I added some funcitonality, like being able to use "e", "East", "E", "east" interchangably. I thought I would need to implement some weird indexing for getting a integer from a list of states to keep track of states like Picobot does, but it worked out okay!
The big change I had to make was, it only accepts one rule at a time! So, passing in multiple rules at a time will not work. The reason I made this change is because it is 11:22 PM, and I hate Scala, and I hate Parser Combinators.

**On a scale of 1–10 (where 10 is "a lot"), how much did you have to change your syntax?**

Probably a 10, considering it can not be used with multiple rules.


**On a scale of 1–10 (where 10 is "very difficult"), how difficult was it to map your syntax to the provided API?**

I don't think it's that difficult, probably a 7. Should I have had more time/was able to start the assignment earlier I probably could have gotten the rest of the functionality desired to work. I also don't like the way parsing is implemented, relying on identifiers and 
# Design

## Who is the target for this design, e.g., are you assuming any knowledge on the part of the language users?

I'm assuming the user will either be familiar with Picobot or won't (so, everyone lol), but it is designed with natural language in mind to be easily understood and accessible to users.

## Why did you choose this design, i.e., why did you think it would be a good idea for users to express the maze-searching computation using this syntax?

I choose this design to give flexibility to users of the DSL. Despite being nearly done with the Mudd CS major, I completely forgot Picobot and had to relearn it. Based on this, I changed the language to be both easily understood as well as give the user flexibility if they want to use syntax from previous Picobot and this new syntax.

## What behaviors are easier to express in your design than in Picobot’s original design?  If there are no such behaviors, why not?

I think the one that stands out is jumping from the empty state back into the same state. By default, not listing a state to go to will go back to the state the picobot is already in, which should result in less code being wrote.
I also intend to add naming states using strings, which I hope should be doable by adding the states to a list and mapping them to indices.

## What behaviors are more difficult to express in your design than in Picobot’s original design? If there are no such behaviors, why not?

I think the only thing more difficult to express is... writing it? Because of the addition of natural language, the user must write keywords like "from", "in", "to" for each state/direction. 

## On a scale of 1–10 (where 10 is “very different”), how different is your syntax from PicoBot’s original design?

I don't think there's much different about it. Sure you can now name states using strings and can leave state changes out and it will still work (given it compiles), and there's now natural languages, but it's nothing crazy and generally follows the same implementation in Picobot originally. I'd say a 6 in terms of how different it is.

## Is there anything you would improve about your design?

I would probably want to add more forgiveness to the user, so keywords like "in" and "from" can be completely optional and new syntax like the reserved word "West" can be mixed with old syntax like "*" and "E". 
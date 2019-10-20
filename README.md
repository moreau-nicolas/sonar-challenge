sonar-challenge
===============

## DISCLAIMER

**This project is for *EDUCATIONAL* purposes *ONLY*.**

You shouldn't code like this. **EVER.** :no_good:

## Why we did this awful thing

During [SoCraTes FR 2019](https://socrates-fr.github.io) we wanted to see if we could write (really) bad code without
 getting caught by code-quality tools. :trollface:

We wanted to see if it was at all possible to write unmaintainable code that still passed all the default checks,
 and how far we could take this.

Quite far as it happens. :poop: We'll let you see by yourself.

## How we did it

We used Intellij IDEA 2019.2.3 and SonarLint 4.2.0.3434 with default settings.

We used a [*refuctored*](https://blog.codinghorror.com/new-programming-jargon/) FizzBuzzQuux implementation as a
 starting base.
The code was really horrible but all tests were passing. :heavy_check_mark:

We then tried to get rid of any warnings the tools were raising, in the quickest way we could think of.
Sometimes the worst way we could think of.
Creativity never hurts. :smirk:
 
Of course, all tests *still* pass. :heavy_check_mark:
We even raised the code coverage to 100%. :100:
Both SonarLint and IDEA give no warnings. :scream:
  
## Takeaways

- Code-quality tools are **not** bad, but they are are **not enough**.
- However smart the tools are, it's not *that* hard to game them.
- **Please, please do Code Reviews with human beings.** :pray:

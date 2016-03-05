# nitrore

A snappy NFA/DFA regex engine... or something

## Thoughts

+ RE => AST => NFA => DFA, test for regex inclusivity - store as labeled DFA and execute directly

+ AST => NFA by Thompson Construction

+ NFA => DFA by Rabin-Scott subset construction

+ Minimized DFA by Hopcroft

+ Assess inclusivity / isomorphism efficiently somehow

+ If inclusive, label appropriately and store labeled DFA

## Installation

TBD

## Usage

TBD

    $ java -jar nitrore-0.1.0-standalone.jar [args]

## Options

TBD

## Examples

TBD

### Bugs


## License

Copyright © 2016

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

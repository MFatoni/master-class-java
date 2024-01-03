# naming convention

## package
- always lower case
- package names should be unique
- use domain name, reversed, as prefixe for the package name
- replace invalid character (i.e. -) in domain name with an underscore
- domain name components starting with a number should instead start with an underscore
- domain name components that are java keywords should have that component start with an underscore
- Switch.supplier.com -> com.supplier._switch, 1world.com -> com._1world, Experts-exchange.com -> com.experts_exchange

## class name

- CamelCase, class names should be nouns (they represent things)
- should start with a capital letter
- each word in the name should also start with a capital (e.g. LinkedList)

## interface

- capitalized like class names (CamelCase)
- consider what objects implementing the interface will become of what they will be able to do (List, Comparable, Serializeable)

## methods names

- mixedCase
- often verbs
- reflect the function performed or the result returned, size(), getName(), addPlayer()

## constants

- all UPPER_CASE
- separate words with underscore _
- declared using the final keyword

## variable names

- mixedCase
- meaningful and indicative
- start with lower case letter
- do not use underscore _ (i, league, sydneySwans, boxLength)

## type parameters

- single character, capital letters
- E element
- K key
- T type
- V value
- S, U, V 2nd 3rd 4th type 
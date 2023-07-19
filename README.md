# STS3006: Competitive Coding Basics
## Record of algorithms in classroom

## [Fibonacci Series](src/Fibonacci.java)
### Concept
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
### Approach
### Complexities
>#### Time
>O(n<sup>2</sup>)

>#### Space
>O(n)

## [Prime Number](src/prime.java)
### Concept
2, 3, 5, 7, 11,... 
Numbers divisble by 1 and number itself
### Approach
### Complexities
>#### Time
>O(log(log n))

>#### Space
>O(n)

## [Euler's Totient Function](src/eulers_totient_fnc.java)
### Concept
Number of co-prime pairs from 1 to N (1,N; 2,N...) for a number N
Φ(1) = 1
Φ(2) = 1
Φ(10) = 4
### Approach
### Complexities
>#### Time
>O(n(log(n)))

>#### Space
>O(n)

## [strobogrammatic Number](src/strobogrammatic.java)
### Concept
1 Digit- 0,1,8
2 Digit- 0,1,8,(6,9)

### Approach
Split int into array of digits and check each digit. 
Higher Efficiency for single digit
In each iteration of the loop, the method compares the characters at the left and right positions.
If the pair of characters forms a strobogrammatic pair, meaning they are either '0' and '0', '1' and '1', '8' and '8', '6' and '9', or '9' and '6', the pointers are moved closer to the center by incrementing left and decrementing right.
If the characters do not form a strobogrammatic pair, the method immediately returns false

### Complexities
>#### Time
>O(n)

>#### Space
>O(1)

## [Bulb Toggle](src/bulbToggle.java)

## [Alice Apple](src/aliceApple.java)
### Concept
M: The number of red apples required.<br />
K: The number of red apples each tree grows.<br />
N: The number of trees in the North that do not have red apples.<br />
S: The number of trees in the South that do not have green apples.<br />
W: The number of trees in the West that have some red apples.<br />
E: The number of trees in the East that have some green apples.<br /><br />
Check if M can be satisfied only from South direction, so output is minimum M.<br />
If M can't be satisfied only from South, then we start looking in West & East and 
we use  (S * K + E + W) apples. <br />
If M still can't be satisfied then -1 because North does not have Red Apples.

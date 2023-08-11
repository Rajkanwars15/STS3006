
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

## [Chinese Remainder Theorem](src/chineseRemainderTheorem.java)

# Bitwise Operator Algorithms

## [Reverse Bits of an Integer](src/reverseBits.java)
### Concept
Input of integer N. Take binary of this integer. Reverse the binary expression. Print reversed binary expression as a decimal.

### Approach
Bits of N are are obtained using bitwise right shift. <br />
Collect the bits using bitwise left shift.

### Complexities
>#### Time
>O(n)

>#### Space
>O(1)

## [Longest sequence of 1’s in binary with 1 flip](src/binaryLongestSequence.java)
### Concept
Flip exactly 1 bit in integer to find longest sequence of 1's.

## [Booth's Algorithm](src/booth.java)
### Concept
A<sub>C</sub>, Q<sub>n+1</sub> = 0 <br/>
Q<sub>n</sub>, B<sub>r</sub>, S<sub>c</sub><br/>
Int to binary should be minimum 4 bits. <br/>
Q<sub>n</sub> is multiplier

Find 3x6 <br/>

| A<sub>C</sub> | Q<sub>n</sub> | Q<sub>n+1</sub> |
|---------------|---------------|-----------------|
| 0000          | 0110          | 0               |
| 0000          | 0011          | 0               |
| 1101          | 1001          | 1               |
| 1111          | 0100          | 1               |
| 0001          | 0010          | 0              |

### Approach
yet to understand

### Complexities
>#### Time
>O(n)

>#### Space
>O(1)

## [Swap two nibbles in a byte](src/swapNibbles.java)
### Concept
A byte has 8 bits, nibble has 4.

### Approach
Extract LSB 4 bits and left shift them by 4
Extract MSB 4 bits and right shift them bt 4

### Complexities
>#### Time
>O(1)

>#### Space
>O(1)

## [Binary Palindrome](src/binaryPalindrome.java)

### Complexities
>#### Time
>O(logn)

>#### Space
>O(1)

## [Karatsuba Algorithm](src/karatsuba.java)
### Concept
Divide & Conquer algorithm

| 12 | 34 | 56 | 78 |
|----|----|----|----|
| A  | B  | C  | D  |

| ac    | bd    | (a+b)(c+d) |
|-------|-------|------------|
| 1 x 5 | 2 x 6 | 3 x 11     |
| 5     | 12    | 33         |

# Array Algo

## [Max Sum of Hourglass in given matrix](src/hourglassMaxSum.java)

### Concept
3x3 matrix. Shape of: I to take only 7 cells.
Print max sum obtained, the elements which result in the sum and their index positions.

### Approach
Start from 0,0. Go upto R-2, C-2.
#### 1<sup>st</sup> Iteration
Check sum of 0,0; 0,1; 0,2; 1,1; 2,0; 2,1; 2,2

### Complexities
>#### Time
>O(n<sup>2</sup>)

>#### Space
>O(n)

## [Maximum Product Subarray](src/maxProdSubArr.java)

### Concept
> i <= j
>
> {-6, -2, 0, -2, 4}

Start i,j from [0] = -6

| i,j   | i = 0                  | i = 1       | i = 2   | i = 3     | i = 4   |
|-------|------------------------|-------------|---------|-----------|---------|
| j = 0 | {-6} = -6              | {-2} = -2   | {0} = 0 | {-2} = -2 | {4} = 4 |
| j = 1 | {-6, -2} = 12          | {-2, 0} = 0 | ------- | -------   | ------- |
| j = 2 | {-6, -2, 0} = 0        | -------     | ------- | -------   | ------- |
| j = 3 | {-6, -2, 0, -2} = 0    | -------     | ------- | -------   | ------- |
| j = 4 | {-6, -2, 0, -2, 4} = 0 | -------     | ------- | -------   | ------- |

Print index position of subarray which gives maximum product

### Approach


### Complexities
>#### Time
>O(n<sup>2</sup>)

>#### Space
>O(1)

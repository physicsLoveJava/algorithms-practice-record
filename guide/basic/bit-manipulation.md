
## & | ^ ~ << >> <<< >>>

### ^
x ^ 1 --> flip
x ^ 0 --> x

## set-bit
```javascript
function setBit(x, pos) {
    var mask = 1 << pos;
    return x | mask;
}
```

## clear-bit
```javascript
function clearBit(x, pos) {
    var mask = 1 << pos;
    return x & ~mask;
}
```

## flip-bit
```javascript
function flipBit(x, pos) {
    var mask = 1 << pos;
    return x ^ pos;
}
```

## is-bit-set 
```javascript
//pos is not include the bits
function isBitSet(x, pos) {
    return (x >> pos) & 1;
}
```

## modify-bit
```javascript
function modify_bit(x, pos, state) {
    var mask = 1 << pos;
    return (x & ~mask) | (-state & mask);
}
```

## isEven
```javascript
function isEven(x) {
    return (x & 1) === 0;
}
```

## is power of two
```javascript
function isPowerOftwo(x) {
    return (x & x - 1) === 0;
}
```

## 1's complement
0101 flip bits
1010

--> zero with two representation
0000
1111

### add (sign bit carry will do round carry up)
0101 5
+ 
1110 -1
=
0100 4

0 0000
1 0001
2 0010
3 0011
4 0100
5 0101
6 0110
7 0111

-0 1111
-1 1110
-2 1101
-3 1100
-4 1011
-5 1010
-6 1001
-7 1000

## 2's complement
1’s complement + 1

without two zero representation
and add don't have to consider the sign bit carry, just throw

0 0000
1 0001
2 0010
3 0011
4 0100
5 0101
6 0110
7 0111

-0 0000
-1 1111
-2 1110
-3 1101
-4 1100
-5 1011
-6 1010
-7 1001
-8 1000

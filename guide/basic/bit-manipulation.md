
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



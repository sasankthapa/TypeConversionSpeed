# TypeConversionSpeed
This is a series of test I do in different language to see how long it takes to convert from 1 data type to another.

Currently written in java and javascript with the following result in a mint VM:
  For Java:
      'Int to String'
      Using Integer.toString() : 0.040518ms
      Using String.valueOf() : 0.009895ms

      'String to Int'
      Using Integer.parseInt() : 0.025039ms
      Using Integer.valueOf() : 0.017098ms
    
  For Javascript:
      'Int to String'
      Using String() : 0.012296999804675579ms
      Using .toString() : 0.0041419994086027145ms

      'String to Int'
      Using Number() : 0.005277000367641449ms
      Useing parseInt() : 0.004111000336706638ms

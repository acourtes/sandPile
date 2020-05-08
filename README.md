# Sandpile kata
This kata is from a coding game exercise.

We have a square grid with odd length. Each cell can contain sand grains.

At each turn, we add one sand grain at the center of the square.

If the cell reaches 4 sand grains, it distributes one to each of its directly 4 adjacent cells.

If the cell receiving a sand grain reaches 4 sand grains, it operates the same with its adjacent neighbours cells.

And so on, and so on...

The grid can have a max length of 9 and we can add a sand grain 100 times max.

Let's schematize this !

```
0 | 1 | 0       0 | 2 | 0       1 | 2 | 0
0 | 3 | 0  ->   1 | 0 | 1 ->    1 | 1 | 1
0 | 1 | 0       0 | 2 | 0       0 | 2 | 0

A little bit more tricky:
0 | 3 | 0       2 | 1 | 2
3 | 3 | 3  ->   1 | 0 | 1
0 | 3 | 0       2 | 1 | 2

Still a little bit more:
0 | 0 | 3 | 0 | 0                   0 | 1 | 0 | 1 | 0
0 | 0 | 3 | 0 | 0 (We add 5 grains) 1 | 2 | 3 | 2 | 1
3 | 3 | 3 | 3 | 3       ->          0 | 3 | 0 | 3 | 0
0 | 0 | 3 | 0 | 0                   1 | 2 | 3 | 2 | 1
0 | 0 | 3 | 0 | 0                   0 | 1 | 0 | 1 | 0

The big One:
0 | 0 | 0 | 0 | 3 | 0 | 0 | 0 | 0       0 | 0 | 0 | 1 | 0 | 1 | 0 | 0 | 0
0 | 0 | 0 | 0 | 3 | 0 | 0 | 0 | 0       0 | 0 | 0 | 1 | 1 | 1 | 0 | 0 | 0
0 | 0 | 0 | 0 | 3 | 0 | 0 | 0 | 0       0 | 0 | 0 | 1 | 1 | 1 | 0 | 0 | 0
0 | 0 | 0 | 0 | 3 | 0 | 0 | 0 | 0       1 | 1 | 1 | 2 | 2 | 2 | 1 | 1 | 1
3 | 3 | 3 | 3 | 3 | 3 | 3 | 3 | 3 ->    0 | 1 | 1 | 2 | 0 | 2 | 1 | 1 | 0 
0 | 0 | 0 | 0 | 3 | 0 | 0 | 0 | 0       1 | 1 | 1 | 2 | 2 | 2 | 1 | 1 | 1
0 | 0 | 0 | 0 | 3 | 0 | 0 | 0 | 0       0 | 0 | 0 | 1 | 1 | 1 | 0 | 0 | 0
0 | 0 | 0 | 0 | 3 | 0 | 0 | 0 | 0       0 | 0 | 0 | 1 | 1 | 1 | 0 | 0 | 0
0 | 0 | 0 | 0 | 3 | 0 | 0 | 0 | 0       0 | 0 | 0 | 1 | 0 | 1 | 0 | 0 | 0
```

You will find a solution proposal in Java in this repo.

Enjoy !
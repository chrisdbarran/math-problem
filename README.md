# math-problem
A maths puzzle sent home with my daughter

The puzzle is to basically place numbers in an array as in this
example:

For : 3
3|1|2|1|3|2|

Where there are 3 other numbers between each 3, 2 other numbers between each 2 and one number between each 1.

We found a solution for 4 but couldn't do 5, so I wrote this program to try every combination looking for solutions.

Probably not the  most elegant program but it works, at least to find the first solution for any number.

It looks like there aren't solutions for consecutive pairs of numbers e.g. 1,2, 5,6, 9,10 so I skip those.

I don't know if there are more than one solution for those where there is a solution except the obvious of reversing
the array.

I've calculated solutions into the 40's. Up to 36 is quick, 39 takes minutes on my MBP.

```
Solutions up to 36. 

Solving : 3
3|1|2|1|3|2|

Solving : 4
4|1|3|1|2|4|3|2|

Solving : 7
7|3|6|2|5|3|2|4|7|6|5|1|4|1|

Solving : 8
8|3|7|2|6|3|2|4|5|8|7|6|4|1|5|1|

Solving : 11
11|6|10|2|9|3|2|8|6|3|7|5|11|10|9|4|8|5|7|1|4|1|

Solving : 12
12|10|11|6|4|5|9|7|8|4|6|5|10|12|11|7|9|8|3|1|2|1|3|2|

Solving : 15
15|13|14|8|5|12|7|11|4|10|5|9|8|4|7|13|15|14|12|11|10|9|6|3|1|2|1|3|2|6|

Solving : 16
16|14|15|9|7|13|3|12|6|11|3|10|7|9|8|6|14|16|15|13|12|11|10|8|5|2|4|1|2|1|5|4|

Solving : 19
19|17|18|14|8|16|9|15|6|1|13|1|12|8|11|6|9|10|14|17|19|18|16|15|13|12|11|7|10|3|5|2|4|3|2|7|5|4|

Solving : 20
20|18|19|15|11|17|10|16|9|5|14|1|13|1|12|5|11|10|9|15|18|20|19|17|16|14|13|12|8|4|7|3|6|2|4|3|2|8|7|6|

Solving : 23
23|21|22|18|16|20|12|19|11|8|17|4|1|15|1|14|4|13|8|12|11|16|18|21|23|22|20|19|17|15|14|13|10|7|9|3|5|2|6|3|2|7|5|10|9|6|

Solving : 24
24|22|23|19|17|21|13|20|10|8|18|4|1|16|1|15|4|14|8|10|13|12|17|19|22|24|23|21|20|18|16|15|14|11|12|7|9|3|5|2|6|3|2|7|5|11|9|6|

Solving : 27
27|25|26|22|20|24|17|23|12|13|21|7|4|19|1|18|1|4|16|7|15|12|14|13|17|20|22|25|27|26|24|23|21|19|18|16|15|14|11|9|10|5|2|8|3|2|6|5|3|9|11|10|8|6|

Solving : 28
28|26|27|23|21|25|18|24|15|13|22|10|6|20|1|19|1|3|17|6|16|3|10|13|15|18|21|23|26|28|27|25|24|22|20|19|17|16|14|12|9|7|11|4|2|5|8|2|4|7|9|5|12|14|11|8|

Solving : 31
31|29|30|26|24|28|21|27|18|16|25|13|11|23|6|22|5|1|20|1|19|6|5|17|11|13|16|18|21|24|26|29|31|30|28|27|25|23|22|20|19|17|15|12|14|9|10|2|3|4|2|8|3|7|4|9|12|10|15|14|8|7|

Solving : 32
32|30|31|27|25|29|22|28|19|17|26|13|11|24|6|23|5|1|21|1|20|6|5|18|11|13|16|17|19|22|25|27|30|32|31|29|28|26|24|23|21|20|18|16|15|12|14|9|10|2|3|4|2|8|3|7|4|9|12|10|15|14|8|7|

Solving : 35
35|33|34|30|28|32|25|31|22|20|29|17|14|27|10|26|5|6|24|1|23|1|5|21|6|10|19|14|18|17|20|22|25|28|30|33|35|34|32|31|29|27|26|24|23|21|19|18|16|13|15|12|9|4|2|11|3|2|4|8|3|7|9|13|12|16|15|11|8|7|

Solving : 36
36|34|35|31|29|33|26|32|23|21|30|17|14|28|10|27|5|6|25|1|24|1|5|22|6|10|20|14|19|17|18|21|23|26|29|31|34|36|35|33|32|30|28|27|25|24|22|20|19|18|16|13|15|12|9|4|2|11|3|2|4|8|3|7|9|13|12|16|15|11|8|7|

```

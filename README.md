# rscalaexample
Example for using Scala from R

You will find here an example for integrating Scala into your R scripts.

Basically it uses rJava to load the Scala classes and call the methods.

The example provides to functions:

* calcScala(x,y) to let the Scala class calculate the sum of x+y
* calcR(x,y) to let the Scala class call R (using JRI) to calculate within R the sum of x+y

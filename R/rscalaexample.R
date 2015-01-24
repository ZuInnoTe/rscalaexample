# RScalaExample
# Using Scala from R and vice versa
# Author: Jörn Franke / ZuInnoTe <zuinnote@gmail.com>
library(rJava)

# calcR calls a Scala method which calculates a sum of two integers
# x: first integer
# y: second integer
# returns x+y
calcScala <- function(x,y){
   hjw <- .jnew("RScalaExample") # create instance of RScalaExample class
   sum <- .jcall(hjw, "I", "calcScala", x ,y) # invoke calcScala method
   return(sum)
}

# calcR calls a Scala method which itself uses R to calculate a sum of two integers
# x: first integer
# y: second integer
# returns x+y
calcR <- function(x,y){
   hjw <- .jnew("RScalaExample") # create instance of RScalaExample class
   sum <- .jcall(hjw, "I", "calcR", x ,y) # invoke calcR method
   return(sum)
}

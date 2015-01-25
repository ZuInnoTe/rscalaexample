# RScalaExample
# Using Scala from R and vice versa
# Author: Jörn Franke / ZuInnoTe <zuinnote@gmail.com>

# calcR calls a Scala method which calculates a sum of two integers
# x: first integer
# y: second integer
# returns x+y
calcScala <- function(x,y){
   rse <- .jnew("org.zuinnote.rscalaexample.RScalaExample") # create instance of RScalaExample class
   sum <- .jcall(rse, "I", "calcScala", as.integer(x) ,as.integer(y)) # invoke calcScala method
   return(sum)
}

# calcR calls a Scala method which itself uses R to calculate a sum of two integers
# x: first integer
# y: second integer
# returns x+y
calcR <- function(x,y){
   rse <- .jnew("org.zuinnote.rscalaexample.RScalaExample") # create instance of RScalaExample class
   sum <- .jcall(rse, "I", "calcR", as.integer(x) ,as.integer(y)) # invoke calcR method
   return(sum)
}

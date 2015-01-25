.onLoad <- function(libname, pkgname) {
  .jpackage(jars='*', pkgname, lib.loc = libname)
}

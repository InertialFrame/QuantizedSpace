package com.github.maxinertia

import space._

/**
  * A set of three traits used to describe quantized spaces: Spaces that can be described with a
  * '''set of locations''' (to give the space... space!) and a '''set of directions''' (to traverse the space).
  *
  * 1. [[Space]]
  *  - Contains any operations that can be applied to arbitrary spaces.
  *  - Implementing Space requires an implementation of Location and Direction.
  *
  * 2. [[Location]]
  *  - An atom of space.
  *  - A container for whatever you want in your space!
  *
  * 3. [[Direction]]
  *  - A direction in which adjacent locations to some reference location ''may'' be found.
  *
  * @author Dorian Thiessen
  * Created on 2018-04-21.
  */
package object space {

}

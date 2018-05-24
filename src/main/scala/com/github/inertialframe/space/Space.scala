package com.github.inertialframe.space

/**
  * A space of arbitrary dimensionality.
  *
  * Examples:
  *  - 1D: Row, Column, List, ...
  *  - 2D: Square grid, hexagonal grid, ...
  *  - 3D: Quantized space (Made up of discrete locations, ie: Not continuous)
  *
  * @author Dorian Thiessen
  * Created on 2018-04-21.
  */
trait Space[D <: Direction, L <: Location] {

  /**
    * Returns a list of tuples where each tuple corresponds to a
    * unique location adjacent to the provided location.
    *
    *  (1) The direction of the adjacent location with
    *      respect to the provided location, and
    *
    *  (2) a reference to the adjacent location.
    *
    * @param location Some location in a Space
    * @return The list of adjacent locations.
    */
  def adjacentTo(location: L): List[(D, L)]

  /**
    * Returns the location adjacent to the specified location
    * in the specified direction if it exists, otherwise None.
    *
    * @param location A location
    * @param direction A direction
    * @return Some(adjacent-location) or None
    */
  def inDirection(location: L, direction: D): Option[L]
}

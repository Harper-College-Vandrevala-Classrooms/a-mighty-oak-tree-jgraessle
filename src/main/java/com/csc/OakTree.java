package com.csc;

class Squirrel {
  private String name;
    
  Squirrel(String name) {
      this.name = name;
  }
    
  String getName() {
      return this.name;
  }
}

public class OakTree {

  private Squirrel squirrel;

  public OakTree(Squirrel squirrel) {
    this.squirrel = squirrel;
  }

  private OakTree left, right;

  public void SetLeft(OakTree oak) {
    if (left == null) {
      left = oak;
    }
    else {
      left.SetLeft(oak);
    }
  }

  public void SetRight(OakTree oak) {
    if (right == null) {
      right = oak;
    }
    else {
      right.SetRight(oak);
    }
  }

  public OakTree GetLeft() {
    return left;
  }

  public OakTree GetRight() {
    return right;
  }
  public static void main(String[] args) {

    // creating Squirrel objects
    Squirrel squirrel = new Squirrel("squir");
    Squirrel squirrel1 = new Squirrel("squirr");
    Squirrel squirrel2 = new Squirrel("squirre");
    Squirrel squirrel3 = new Squirrel("squirrel");

    // creating OakTree objects
    OakTree oak = new OakTree(squirrel);
    OakTree oak1 = new OakTree(squirrel1);
    OakTree oak2 = new OakTree(squirrel2);
    OakTree oak3 = new OakTree(squirrel3);

    // placing OakTree objects in tree
    oak.SetLeft(oak1);
    oak.SetRight(oak2);
    oak2.SetRight(oak3);

    // Testing that OakTrees are correctly placed
    System.out.println(oak1.squirrel.getName());
    System.out.println(oak.GetLeft().squirrel.getName());
    System.out.println(oak2.squirrel.getName());
    System.out.println(oak.GetRight().squirrel.getName());
    System.out.println(oak3.squirrel.getName());
    System.out.println(oak2.GetRight().squirrel.getName());

  }
}

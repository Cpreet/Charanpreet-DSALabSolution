package com.dsalabsolution.driver;

import com.dsalabsolution.classes.BracketExpression;

class Main {

  public static void main(String[] args) {

    String bracketExpression = "({[[[]]])";

    BracketExpression be = new BracketExpression();
    
    if (be.isBalanced(bracketExpression)) {
      System.out.print("Balanced Brackets");
    }
    else {
      System.out.println("Unbalanced Brackets");
    }
  }
}
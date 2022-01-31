package com.dsalabsolution.classes;

import java.util.Stack;

public class BracketExpression {
  public boolean isBalanced(String bracketExpression) {
    Stack<Character> stack = new Stack<Character>();

    for (int i = 0; i < bracketExpression.length(); i++) {
      char character = bracketExpression.charAt(i);

      if (character == '(' || character == '[' || character == '{') {
        stack.push(character);
        continue;
      }

      char c;

      switch(character) {
          
        case '}':
          c = stack.pop();
          if (c == '(' || c == '[')
            return false;
          break;

        case ')':
          c = stack.pop();
          if (c == '{' || c == '[')
            return false;
          break;

        case ']':
          c = stack.pop();
          if (c == '{' || c == '(')
            return false;
          break;
      }
    }
    return stack.isEmpty();
  }
}
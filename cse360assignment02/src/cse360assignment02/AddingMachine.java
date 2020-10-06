/**
 * 
 * @author Jixuan Lu
 * This is an AddingMachine class which used to 
 * calculate add and subtract and out put whole 
 * equation
 * 
 */

package cse360assignment02;
import java.lang.StringBuffer;

public class AddingMachine
{
  private int total;
  private StringBuffer memory;

/**
 * This is constructor use to initialize object
 */
  public AddingMachine ()
  {
	  total = 0;  // not needed - included for clarity
	  memory = new StringBuffer("0");
  }

/**
 * This is the getter 
 * @return total
 */
  public int getTotal ()
  {
	  return this.total;
  }

/**
 * This is add method to calculate addition
 * @param value
 */
  public void add (int value)
  {
	  this.total = this.total + value;
	  this.memory.append(" + " + value);
  }

/**
 * This is subtract method to calculate subtraction
 * @param value
 */
  public void subtract (int value)
  {
	  this.total = this.total - value;
	  this.memory.append(" - " + value);
  }

/**
 * This is toString method return history of the transactions
 */
  public String toString ()
  {
	  String result = "";
	  result = memory.toString();
	  return result;
  }

/**
 * This is the clear method to reset. the total value and memory.
 */
  public void clear()
  {
	  this.total = 0;
	  this.memory = new StringBuffer("0");
  }
}
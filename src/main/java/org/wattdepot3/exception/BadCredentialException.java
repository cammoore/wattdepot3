/**
 * UniqueIdException.java created on Oct 3, 2013 by Cam Moore.
 */
package org.wattdepot3.exception;

/**
 * UniqueIdException thrown when an object is defined with the same unique id as
 * another object of the same type.
 * 
 * @author Cam Moore
 * 
 */
public class BadCredentialException extends Exception {

  /** Serial Version ID. */
  private static final long serialVersionUID = -7949771009371995775L;

  /** Default Constructor. */
  public BadCredentialException() {
    super();
  }

  /**
   * @param message
   *          A String message about the exception.
   * @param cause
   *          The Throwable cause of the exception.
   */
  public BadCredentialException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * @param message
   *          A String message about the exception.
   */
  public BadCredentialException(String message) {
    super(message);
  }

  /**
   * @param cause
   *          The Throwable cause of the exception.
   */
  public BadCredentialException(Throwable cause) {
    super(cause);
  }

}

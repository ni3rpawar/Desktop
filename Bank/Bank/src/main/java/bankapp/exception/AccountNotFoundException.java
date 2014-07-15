
package bankapp.exception;

/**
 * 
 * CSI3317_PROJECT
 *
 * @file AccountNotFoundException.java
 * @package bankapp.exception
 * @author Mohamed Mansour @2005
 * @email m0.interactive@gmail.com
 * @web www.m0interactive.com
 * @date 9-Dec-2005
 *
 */
public class AccountNotFoundException extends Exception {

    public AccountNotFoundException () { }

    public AccountNotFoundException (String msg) {
        super(msg);
    } 
}


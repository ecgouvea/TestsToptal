/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String... argvs) {
        String a = "Che";
        System.out.println("Hello World " + a + "!");
        System.out.println("Alo mundo " + a + "!");
        System.out.println("!");
        new HelloWorld().solution();
    }

    public void solution() {
        System.out.println("!");
    }
}

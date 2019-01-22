/*
 *    Copyright 2019 Duncan Sterken
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package me.duncte123.primitivepairs;

/**
 * Provides a container for the %1$s and the %2$s primitives
 *
 * @author duncte123
 */
public class %3$s {

    /**
     * THIS CLASS IS AUTO GENERATED, DO NOT HAND EDIT
     */

    private %1$s left;
    private %2$s right;

    /**
     * Constructs a new instance of this class with the provided values
     *
     * @param left
     *         The first value
     * @param right
     *         The second value
     */
    public %3$s(%1$s left, %2$s right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Constructs a new instance of this class with the default values of the types
     */
    public %3$s() {}

    /**
     * Returns the left or first value
     *
     * @return The left or first value
     */
    public %1$s getLeft() {
        return left;
    }

    /**
     * Sets the left or first value
     *
     * @param left
     *         The left or first value
     *
     * @return The current class instance, useful for chaining
     */
    public %3$s setLeft(%1$s left) {
        this.left = left;
        return this;
    }

    /**
     * Returns the right or second value
     *
     * @return The right or second value
     */
    public %2$s getRight() {
        return right;
    }

    /**
     * Sets the right or second value
     *
     * @param right
     *         The right or second value
     *
     * @return The current class instance, useful for chaining
     */
    public %3$s setRight(%2$s right) {
        this.right = right;
        return this;
    }

    @Override
    public String toString() {
        return "%3$s{left=" + getLeft() + ", right=" + getRight() + '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof %3$s)) {
            return false;
        }

        %3$s other = (%3$s) obj;

        return this.getLeft() == other.getLeft() && this.getRight() == other.getRight();
    }
}

package com.googlecode.transloader.clone;


public interface CloningDecisionStrategy {
	boolean shouldCloneObjectItself(Object original, ClassLoader targetClassLoader) throws ClassNotFoundException;

	boolean shouldCloneObjectContent(Object original, ClassLoader targetClassLoader) throws ClassNotFoundException;
}

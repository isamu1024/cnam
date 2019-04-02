package vector;

import java.util.*;

public interface Pile<T> {

	boolean estVide();
	Pile<T> push(T e);
	T getTop();
	Pile<T> pop();
	
}

package day2;

import java.util.Collection;

public interface DaoInterface<T, K> {
	Collection<T> retrieveAll();
	T retrieveOne(K id);
	void create(T t);
	void delete(K id);
	void update(T t);
}

package org.kulentsov;

public class Boxed<T>
{
	public T value; //NOSONAR
	
	public Boxed(T value)
	{
		this.value = value;
	}
	
	public static <T> Boxed<T> of(T value)
    {
        return new Boxed<>(value);
    }
}


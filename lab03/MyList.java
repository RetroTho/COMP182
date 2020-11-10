import java.util.Collection;

public interface MyList<E> extends Collection<E> {
  /** Add a new element at the specified index in this list */
  public void add(int index, E e);

  /** Return the element from this list at the specified index */
  public E get(int index);

  /** Return the index of the first matching element in this list.
   *  Return -1 if no match. */
  public int indexOf(Object e);

  /** Return the index of the last matching element in this list
   *  Return -1 if no match. */
  public int lastIndexOf(E e);

  /** Remove the element at the specified position in this list
   *  Shift any subsequent elements to the left.
   *  Return the element that was removed from the list. */
  public E remove(int index);

  /** Replace the element at the specified position in this list
   *  with the specified element and returns the new set. */
  public E set(int index, E e);
  
  @Override /** Add a new element at the end of this list */
  public default boolean add(E e) {
    add(size(), e);
    return true;
  }

  @Override /** Return true if this list contains no elements */
  public default boolean isEmpty() {
    return size() == 0;
  }

  @Override /** Remove the first occurrence of the element e 
   *  from this list. Shift any subsequent elements to the left.
   *  Return true if the element is removed. */
  public default boolean remove(Object e) {
    if (indexOf(e) >= 0) {
      remove(indexOf(e));
      return true;
    }
    else
      return false;
  }
  
  @Override /** Return true if this list contains the element e */
  public default boolean contains(Object e) {
    // Left as an exercise
    return indexOf(e) != -1;
  }

  @Override
  public default boolean containsAll(Collection<?> c) {
    // Left as an exercise
    int contCount = 0;
    for(Object e : c){
      if(contains(e)){
        contCount++;
      }
    }
    if(contCount == c.size()){
      return true;
    }
    return false;
  }

  @Override
  public default boolean addAll(Collection<? extends E> c) {
    // Left as an exercise
    boolean worked = false;
    for(E e : c){
      add(e);
      worked = true;
    }
    return worked;
  }

  @Override
  public default boolean removeAll(Collection<?> c) {
    // Left as an exercise
    int worked = 0;
    for(Object e : c){
      remove(e);
      worked++;
    }
    if(worked == c.size()){
      return true;
    }
    return false;
  }

  @Override
  public default boolean retainAll(Collection<?> c) {
    // Left as an exercise
    boolean worked = false;
    for(Object e : c){
      if(!c.contains(e)){
            remove(e);
            worked = true;
        }
    }
    return worked;
  }

  @Override
  public default Object[] toArray() {
    // Left as an exercise
    Object[] arr = new Object[size()];
    for(int i = 0; i < size(); i++){
      arr[i] = get(i);
    }

    return arr;
  }

  @Override
  public default <T> T[] toArray(T[] array) {
    // Left as an exercise
    for(int i = 0; i < size(); i++){
      array[i] = (T)get(i);
    }

    return array;
  }
}
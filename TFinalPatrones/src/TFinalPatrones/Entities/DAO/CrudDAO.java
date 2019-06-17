package TFinalPatrones.Entities.DAO;

public interface CrudDAO<T> {
	public T find(T t);
	public void Add(T t);
	public void Delete(T t);
	public void Update(T t);
}

package jun.spring.prj.board1.service.jdbc;

public class QueryVO {
	private String field;
	private String query;
	private int start;
	private int end;
	public String getField() {
		return field;
	}
	public QueryVO(String field, String query, int page) {
		this.field = field;
		this.query = query;
		this.start = 1 + (page-1)*10;
		this.end = page*10;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	@Override
	public String toString() {
		return "QueryVO [field=" + field + ", query=" + query + ", start=" + start + ", end=" + end + "]";
	}
}

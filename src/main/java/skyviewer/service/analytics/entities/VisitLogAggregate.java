package skyviewer.service.analytics.entities;


////POJO class to get the visit log aggregates
public class VisitLogAggregate {
	
	private String pageName;
	private Long  visitNum;
	
	public VisitLogAggregate() {}

	public VisitLogAggregate(String siteName, Long visitNum) {
		super();
		this.pageName = siteName;
		this.visitNum = visitNum;
	}

	public String getSiteName() {
		return pageName;
	}

	public void setSiteName(String pageName) {
		this.pageName = pageName;
	}

	public Long getVisitNum() {
		return visitNum;
	}

	public void setVisitNum(Long visitNum) {
		this.visitNum = visitNum;
	}

	@Override
	public String toString() {
		return "VisitLogAggregate [siteName=" + pageName + ", visitNum=" + visitNum + "]";
	}
	
	

}

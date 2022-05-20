package kr.human.board.vo;

import java.util.List;

// 알고리즘은 동일하고 데이터 타입만 다를 경우 제네릭 클레스로 만든다.
public class PagingVO<T> {
	private List<T> list;
	
	private int totalCount;	// 전체 데이터의 개수(DAO를 통해서 가져온다.)
	private int currentPage;	// 현재 페이지(초기에는 1으로 초기화하여 첫번째 페이지를 나타낸다.)
	private int pageSize;	// 한번에 볼 목록의 크기(현재 페이지에서 보여줄 목록의 개수)
	private int blockSize;	// 한번에 나열할 페이지 번호
	
	
	private int totalPage; // 전체 페이지수 = (totalCount / pageSize) + (totalCount%pageSize)
	private int startNo;
	private int endNo;
	private int startPage;
	private int endPage;
	
	public PagingVO(int totalCount, int currentPage, int pageSize, int blockSize) {
		super();
		this.totalCount = totalCount;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.blockSize = blockSize;
		
		calc();
	}

	private void calc() {
		// 유효성 검사를 진행한다. url창에 사용자가 장난을 칠수도 있기때문에 
		if(totalCount<0) totalCount = 0; 
		if(currentPage<=0) currentPage=1;
		if(pageSize<=1) pageSize=10;
		if(blockSize<=1) pageSize=10;
		
		// 전체 목록의 수가 0보다 크다면 데이터가 있다는 뜻이죠?ㅎ
		if(totalCount>0) {
			totalPage = (totalCount - 1)/pageSize + 1;
			startNo = (currentPage - 1) * pageSize;
			endNo = startNo + pageSize - 1;
			if(endNo>=totalCount) endNo = totalCount - 1;
			startPage = (currentPage - 1)/blockSize * blockSize + 1;
			endPage = startPage + blockSize - 1;
			if(endPage > totalPage) endPage = totalPage;
		}
		
	}

	
	// 메서드 2개 추가
	public String getPageInfo() {
		String info = "전체 : " + totalCount + "개";
		if(totalCount>0) {
			info += "(" + currentPage + "/" + totalPage + "page)";
		}
		return info;
	}
	
	public String getPageList() {
		String pageList="";
		if(totalCount>0) {
			// 시작페이지가 1보다크면  이전이 있다.
			if(startPage>1) {
				pageList +="[<a href='?p="+(startPage-1)+"&s="+pageSize+"&b="+blockSize+"'>이전</a>] ";
			}
			// 페이지번호 출력
			for(int i=startPage;i<=endPage;i++) {
				if(i==currentPage) { // 현재 페이지는 링크가 없다.
					pageList +="[" + i + "] ";
				}else {
					pageList +="[<a href='?p="+ i +"&s="+pageSize+"&b="+blockSize+"'>" + i + "</a>] ";
				}
			}
			// 마지막페이지가 전체페이지보다 적다면 다음이 있다.
			if(endPage<totalPage) {
				pageList +="[<a href='?p="+(endPage+1)+"&s="+pageSize+"&b="+blockSize+"'>다음</a>] ";
			}
		}
		return pageList;
	}
	
	
	@Override
	public String toString() {
		return "PagingVO [list=" + list + ", totalCount=" + totalCount + ", currentPage=" + currentPage + ", pageSize="
				+ pageSize + ", blockSize=" + blockSize + ", totalPage=" + totalPage + ", startNo=" + startNo
				+ ", endNo=" + endNo + ", startPage=" + startPage + ", endPage=" + endPage + "]";
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getBlockSize() {
		return blockSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public int getStartNo() {
		return startNo;
	}

	public int getEndNo() {
		return endNo;
	}

	public int getStartPage() {
		return startPage;
	}

	public int getEndPage() {
		return endPage;
	}
	
	
	
	
}

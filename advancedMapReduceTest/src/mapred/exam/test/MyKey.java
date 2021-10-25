package mapred.exam.test;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableUtils;

public class MyKey implements WritableComparable<MyKey> {
	private String productId;
	private String userId;

	public MyKey() {

	}

	public MyKey(String productId, String userId) {
		super();
		this.productId = productId;
		this.userId = userId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public void readFields(DataInput in) throws IOException {
		productId = WritableUtils.readString(in);
		userId = WritableUtils.readString(in);

	}

	@Override
	public String toString() {
		return (new StringBuffer()).append(productId).append(",").append(userId).toString();
	}

	// 네트워크로 복합키를 전송하기 위해 직렬화 할때 호출되는 메소드
	@Override
	public void write(DataOutput out) throws IOException {
		WritableUtils.writeString(out, productId);
		WritableUtils.writeString(out, userId);
	}

	// 사용자가 만들어 놓은 키를 기준으로 정렬하기 위해서 값들을 비교하도록 처리하는 메소드
	// year로 비교하고 year가 같으면 month로 비교
	@Override
	public int compareTo(MyKey obj) {
		int result = productId.compareTo(obj.productId);
		if (result == 0) { // year와 대상 year가 같다.
			result = userId.compareTo(obj.userId);
		}
		return result;
	}

}

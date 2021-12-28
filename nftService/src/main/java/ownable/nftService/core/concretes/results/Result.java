package ownable.nftService.core.concretes.results;

public class Result {
	/* Common Variables */
	private boolean success;
	private String message;
	
	/* Constructor 1 */
	public Result(boolean success) {
		this.success = success;
	}
	
	/* Constructor 2 */
	public Result(boolean success, String message) {
		this(success);
		this.message = message;
	}
	public boolean isSuccess() {
		return this.success;
	}
	
	public String getMessage() {
		return this.message;
	}
}

package co.edureka.model;

// Bean (Spring FW)
public class Connection {

	// Attributes
	String url;
	String user;
	String password;
	String dbName;
	
	public Connection() {
		System.out.println(">> Connection Object Constructed");
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	@Override
	public String toString() {
		return "Connection [url=" + url + ", user=" + user + ", password=" + password + ", dbName=" + dbName + "]\nHashCode:"+super.toString();
	}
	
	// method name can be any name of your choice
	public void myInit(){
		System.out.println(">> myInit of Connection");
	}
	
	public void myDestroy(){
		System.out.println(">> myDestroy of Connection");
	}
	
}

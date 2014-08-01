package org.hydra.matcher;

public class FieldSignature {
	public FieldSignature(String name) {
		this.name = name;
	}

	private String name;
	protected int flags;
	private ClassSignature type;
	protected Object value;

	public void setFlags(int access) {
		this.flags = access;
	}

	public void setType(ClassSignature classSignature) {
		this.type = classSignature;
	}

	@Override
	public String toString() {
		return this.getLevel0Sig();
	}

	public String getLevel0Sig() {
		return Types.qualify(type.getName());
	}

	private boolean ignore = false;
	private String originDesc;

	public boolean isIgnore() {
		return this.ignore;
	}

	public void setIgnore(boolean b) {
		this.ignore = b;
	}

	public String getName() {
		return this.name;
	}

	public void setOriginDesc(String desc) {
		this.originDesc = desc;
	}

	public String getOriginDesc() {
		return this.originDesc;
	}
}

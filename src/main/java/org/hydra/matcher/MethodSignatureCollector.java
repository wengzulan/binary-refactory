package org.hydra.matcher;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class MethodSignatureCollector extends MethodVisitor {
    private MethodSignature methodSig;

    public MethodSignatureCollector(MethodSignature methodSig) {
		super(Opcodes.ASM5);
		
		this.methodSig = methodSig;
	}

	public AnnotationVisitor visitAnnotationDefault() {
        // TODO Auto-generated method stub
        return null;
    }

    public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
        // TODO Auto-generated method stub
        return null;
    }

    public AnnotationVisitor visitParameterAnnotation(int parameter, String desc, boolean visible) {
        // TODO Auto-generated method stub
        return null;
    }

    public void visitAttribute(Attribute attr) {
        // TODO Auto-generated method stub

    }

    public void visitCode() {
        // TODO Auto-generated method stub

    }

    public void visitFrame(int type, int nLocal, Object[] local, int nStack, Object[] stack) {
        // TODO Auto-generated method stub

    }

    public void visitInsn(int opcode) {
        this.methodSig.addInsn(opcode);
    }

    public void visitIntInsn(int opcode, int operand) {
        this.methodSig.addInsn(opcode);
    }

    public void visitVarInsn(int opcode, int var) {
        this.methodSig.addInsn(opcode);
    }

    public void visitTypeInsn(int opcode, String type) {
        this.methodSig.addInsn(opcode);
    }

    public void visitFieldInsn(int opcode, String owner, String name, String desc) {
        this.methodSig.addInsn(opcode);
    }

    public void visitMethodInsn(int opcode, String owner, String name, String desc) {
        this.methodSig.addInsn(opcode);
    }

    public void visitJumpInsn(int opcode, Label label) {
        this.methodSig.addInsn(opcode);
    }

    public void visitLabel(Label label) {
    }

    public void visitLdcInsn(Object cst) {

    }

    public void visitIincInsn(int var, int increment) {

    }

    public void visitLookupSwitchInsn(Label dflt, int[] keys, Label[] labels) {

    }

    public void visitMultiANewArrayInsn(String desc, int dims) {

    }

    public void visitTryCatchBlock(Label start, Label end, Label handler, String type) {

    }

    public void visitLocalVariable(String name, String desc, String signature, Label start, Label end, int index) {

    }

    public void visitLineNumber(int line, Label start) {

    }

    public void visitMaxs(int maxStack, int maxLocals) {

    }

    public void visitEnd() {

    }

}

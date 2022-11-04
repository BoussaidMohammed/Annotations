package org.mql.java.annotations;

import java.lang.reflect.Field;

import org.mql.java.ui.components.Form;

public class FormEngine {
	private Form form;
	
	public FormEngine(Class<?> cls)  {
		FormType fa = cls.getAnnotation(FormType.class);
		if(fa != null) {
			form = new Form(fa.title());
			System.out.println(fa.title());
			Field [] fields = cls.getDeclaredFields();
			for(Field f: fields) {
				TextField tf = f.getAnnotation(TextField.class);
				if(tf != null) {
					String label = tf.label();
					if(label.equals("")) label = f.getName();
					form.addTextField(label,tf.size());
				}else {
					RadioField rf = f.getAnnotation(RadioField.class);
					if(rf != null) {
						String label = rf.label();
						if(label.equals("")) label = f.getName();
						form.addRadioBox(label,rf.items());
					}else {
						ComboField cf = f.getAnnotation(ComboField.class);
						if(cf != null) {
							String label = cf.label();
							if(label.equals("")) label = f.getName();
							form.addCombo(label,cf.items());
						}
					}
				}
			}
		}
	}
	
	public Form getForm() {
		return form;
	}
}

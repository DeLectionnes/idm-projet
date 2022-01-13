package fr.n7.tests;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import fr.n7.PrototypeExploStandaloneSetup;

public class Expl2xmi {

	public static void main(String[] args) {
		exportXMI("/home/drogard/eclipse-workspace/fr.n7.prototypeExplo.tests");
	}
	
	private static void exportXMI(String absuloteTargetFolderPath) {
	    // change MyLanguage with your language name
	    Injector injector = new PrototypeExploStandaloneSetup()
	            .createInjectorAndDoEMFRegistration();
	    XtextResourceSet resourceSet = injector
	            .getInstance(XtextResourceSet.class);

	    // .ext is the extension of the model file
	    String inputURI = "file:///" + absuloteTargetFolderPath + "/sujet.expl";
	    String outputURI = "file:///" + absuloteTargetFolderPath + "/sujet.xmi";
	    URI uri = URI.createURI(inputURI);
	    Resource xtextResource = resourceSet.getResource(uri, true);

	    EcoreUtil.resolveAll(xtextResource);

	    Resource xmiResource = resourceSet
	            .createResource(URI.createURI(outputURI));
	    xmiResource.getContents().add(xtextResource.getContents().get(0));
	    try {
	        xmiResource.save(null);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}

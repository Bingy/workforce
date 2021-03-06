package com.binge.workforce.services;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Bundle;

public interface IImageService {
    
    public Image getImage(String imageKey) throws CoreException;
    public Image getSharedImage(String imageKey) throws CoreException;
    public Image getBundleImage(String imageKey,Bundle bundle) throws CoreException;
}
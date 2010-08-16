package com.binge.workforce.services;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.graphics.Image;

public interface IImageService {
    
    public Image getImage(String imageKey) throws CoreException;
  
}
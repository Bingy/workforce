package com.binge.workforce.services;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Bundle;

public class ImageService implements IImageService
{

    @Override
    public Image getImage(String imageKey) throws CoreException
    {
        return null;
    }

    @Override
    public Image getSharedImage(String imageKey) throws CoreException
    {
        return null;
    }

    @Override
    public Image getBundleImage(String imageKey, Bundle bundle) throws CoreException
    {
        return null;
    }

}

package com.binge.workforce.services;

import org.eclipse.core.runtime.CoreException;

public interface IMessageService
{
    public String getMessage(String messageKey) throws CoreException;
}

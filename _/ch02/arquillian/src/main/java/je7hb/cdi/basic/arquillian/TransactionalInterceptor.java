/*******************************************************************************
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2013,2014 by Peter Pilgrim, Addiscombe, Surrey, XeNoNiQUe UK
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU GPL v3.0
 * which accompanies this distribution, and is available at:
 * http://www.gnu.org/licenses/gpl-3.0.txt
 *
 * Developers:
 * Peter Pilgrim -- design, development and implementation
 *               -- Blog: http://www.xenonique.co.uk/blog/
 *               -- Twitter: @peter_pilgrim
 *
 * Contributors:
 *
 *******************************************************************************/

package je7hb.cdi.basic.arquillian;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 * The type TransactionalInterceptor
 *
 * @author Peter Pilgrim (peter)
 */
@Interceptor
@Transactional
public class TransactionalInterceptor {
    @AroundInvoke
    public Object handleTransaction(InvocationContext ctx) throws Exception {
        System.out.println("TransactionalInterceptor#handleTransaction *before* invocation");
        Object value =  ctx.proceed();
        System.out.println("TransactionalInterceptor#handleTransaction *after* invocation");
        return value;
    }
}

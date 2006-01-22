/*
 * (c) 2004 Stefan Reuter
 *
 * Created on Apr 22, 2004
 */
package net.sf.asterisk.manager.action;

/**
 * The MailboxCountAction queries the number of unread and read messages in a
 * mailbox.<br>
 * The MailboxCountAction returns a MailboxStatusResponse.
 * 
 * @see net.sf.asterisk.manager.response.MailboxCountResponse
 * @author srt
 * @version $Id: MailboxCountAction.java,v 1.4 2005/08/07 00:09:42 srt Exp $
 */
public class MailboxCountAction extends AbstractManagerAction
{
    /**
     * Serializable version identifier
     */
    static final long serialVersionUID = -6900421919824575941L;

    private String mailbox;

    /**
     * Creates a new empty MailboxCountAction.
     */
    public MailboxCountAction()
    {

    }

    /**
     * Creates a new MailboxCountAction that queries the number of unread and
     * read messages in the given mailbox.
     * 
     * @param mailbox the name of the mailbox to query.<br>
     *            This can either be only the number of the mailbox or a string
     *            of the form mailboxnumber@context.If no context is specified
     *            "default" is assumed.
     * @since 0.2
     */
    public MailboxCountAction(String mailbox)
    {
        this.mailbox = mailbox;
    }

    /**
     * Returns the name of this action, i.e. "MailboxCount".
     */
    public String getAction()
    {
        return "MailboxCount";
    }

    /**
     * Returns the name of the mailbox to query.
     */
    public String getMailbox()
    {
        return mailbox;
    }

    /**
     * Sets the name of the mailbox to query.<br>
     * This can either be only the number of the mailbox or a string of the form
     * mailboxnumber@context.If no context is specified "default" is assumed.<br>
     * This property is mandatory.
     */
    public void setMailbox(String mailbox)
    {
        this.mailbox = mailbox;
    }
}

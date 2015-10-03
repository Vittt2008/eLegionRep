package com.e.legion.test.app.databinding;
import com.e.legion.test.app.R;
import com.e.legion.test.app.BR;
import android.view.View;
public class ElementCommitBinding extends android.databinding.ViewDataBinding {
    
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_commit_author, 6);
    }
    // views
    public final com.makeramen.roundedimageview.RoundedImageView ivCommitAuthor;
    private final android.support.v7.widget.CardView mboundView0;
    public final android.widget.TextView tvCommitAuthor;
    public final android.widget.TextView tvCommitData;
    public final android.widget.TextView tvCommitEmail;
    public final android.widget.TextView tvCommitMessage;
    public final android.widget.TextView tvDetailRepoForkedSource;
    // variables
    private com.e.legion.test.app.entities.Commit mCommit;
    private java.text.DateFormat mDateFormat;
    // values
    // listeners
    
    public ElementCommitBinding(View root) {
        super(root, 0);
        final Object[] bindings = mapBindings(root, 7, sIncludes, sViewsWithIds);
        this.ivCommitAuthor = (com.makeramen.roundedimageview.RoundedImageView) bindings[6];
        this.mboundView0 = (android.support.v7.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvCommitAuthor = (android.widget.TextView) bindings[1];
        this.tvCommitAuthor.setTag(null);
        this.tvCommitData = (android.widget.TextView) bindings[3];
        this.tvCommitData.setTag(null);
        this.tvCommitEmail = (android.widget.TextView) bindings[2];
        this.tvCommitEmail.setTag(null);
        this.tvCommitMessage = (android.widget.TextView) bindings[5];
        this.tvCommitMessage.setTag(null);
        this.tvDetailRepoForkedSource = (android.widget.TextView) bindings[4];
        this.tvDetailRepoForkedSource.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
    
    @Override
    public void invalidateAll() {
        synchronized(this) {
            mDirtyFlags = 0b100L;
        }
        requestRebind();
    }
    
    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }
    
    private void log(String msg, long i) {
        android.util.Log.d("BINDER", msg + ":" + Long.toHexString(i));
    }
    
    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.commit :
                setCommit((com.e.legion.test.app.entities.Commit) variable);
                return true;
            case BR.dateFormat :
                setDateFormat((java.text.DateFormat) variable);
                return true;
        }
        return false;
    }
    
    public void setCommit(com.e.legion.test.app.entities.Commit commit) {
        this.mCommit = commit;
        synchronized(this) {
            mDirtyFlags |= 0b1L;
        }
        super.requestRebind();
    }
    public com.e.legion.test.app.entities.Commit getCommit() {
        return mCommit;
    }
    public void setDateFormat(java.text.DateFormat dateFormat) {
        this.mDateFormat = dateFormat;
        synchronized(this) {
            mDirtyFlags |= 0b10L;
        }
        super.requestRebind();
    }
    public java.text.DateFormat getDateFormat() {
        return mDateFormat;
    }
    
    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }
    
    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String AndroidStringShaShaCommitSubstringShaCommitInt0Int6 = null;
        java.lang.String messageCommitCommit = null;
        com.e.legion.test.app.entities.CommitData commitCommit = null;
        java.util.Date dateCommitterCommitCommit = null;
        boolean TextUtilsIsEmptyTextUtilsNameCommitterCommitCommit = false;
        com.e.legion.test.app.entities.Commit commit = mCommit;
        int LogicalNotTextUtilsIsEmptyTextUtilsNameCommitterCommitCommitVISIBLEViewGONEView = 0;
        com.e.legion.test.app.entities.CommitUser committerCommitCommit = null;
        com.e.legion.test.app.entities.User committerCommit = null;
        java.lang.String loginCommitterCommit = null;
        boolean DateCommitterCommitCommitObjectnull = false;
        int DateCommitterCommitCommitObjectnullVISIBLEViewGONEView = 0;
        java.lang.String nameCommitterCommitCommit = null;
        java.lang.String dateFormatFormatDateFormatDateCommitterCommitCommit = null;
        java.lang.String shaCommitSubstringShaCommitInt0Int6 = null;
        java.lang.String shaCommit = null;
        boolean logicalNotTextUtilsIsEmptyTextUtilsNameCommitterCommitCommit = false;
        java.text.DateFormat dateFormat = mDateFormat;
    
        if ((dirtyFlags & 0b111L) != 0) {
        
        
        
            // read commit~.~commit~
            if ( commit != null) {
                commitCommit = commit.commit;
            }
        
            if ((dirtyFlags & 0b101L) != 0) {
            
                // read message~.~commit~.~commit~
                if ( commitCommit != null) {
                    messageCommitCommit = commitCommit.message;
                }
            }
        
        
            // read committer~.~commit~.~commit~
            if ( commitCommit != null) {
                committerCommitCommit = commitCommit.committer;
            }
        
        
            // read date~.~committer~.~commit~.~commit~
            if ( committerCommitCommit != null) {
                dateCommitterCommitCommit = committerCommitCommit.date;
            }
        
            if ((dirtyFlags & 0b101L) != 0) {
            
                // read !=~date~.~committer~.~commit~.~commit~~Objectnull
                DateCommitterCommitCommitObjectnull = dateCommitterCommitCommit !=null;
                // setting conditional flags
                if (DateCommitterCommitCommitObjectnull) {
                    dirtyFlags |= 0b1000000L;
                } else {
                    dirtyFlags |= 0b100000L;
                }
            
            
                // read ?:!=~date~.~committer~.~commit~.~commit~~Objectnull~VISIBLE~.~View~~GONE~.~View~
                DateCommitterCommitCommitObjectnullVISIBLEViewGONEView = DateCommitterCommitCommitObjectnull ? android.view.View.VISIBLE : android.view.View.GONE;
            }
        
            if ((dirtyFlags & 0b101L) != 0) {
            
                // read name~.~committer~.~commit~.~commit~
                if ( committerCommitCommit != null) {
                    nameCommitterCommitCommit = committerCommitCommit.name;
                }
            
            
                // read TextUtils~~isEmpty~TextUtils~~name~.~committer~.~commit~.~commit~
                TextUtilsIsEmptyTextUtilsNameCommitterCommitCommit = android.text.TextUtils.isEmpty(nameCommitterCommitCommit);
            
            
                // read logicalNot~TextUtils~~isEmpty~TextUtils~~name~.~committer~.~commit~.~commit~
                logicalNotTextUtilsIsEmptyTextUtilsNameCommitterCommitCommit = !TextUtilsIsEmptyTextUtilsNameCommitterCommitCommit;
                // setting conditional flags
                if (logicalNotTextUtilsIsEmptyTextUtilsNameCommitterCommitCommit) {
                    dirtyFlags |= 0b10000L;
                } else {
                    dirtyFlags |= 0b1000L;
                }
            
            
                // read ?:logicalNot~TextUtils~~isEmpty~TextUtils~~name~.~committer~.~commit~.~commit~~VISIBLE~.~View~~GONE~.~View~
                LogicalNotTextUtilsIsEmptyTextUtilsNameCommitterCommitCommitVISIBLEViewGONEView = logicalNotTextUtilsIsEmptyTextUtilsNameCommitterCommitCommit ? android.view.View.VISIBLE : android.view.View.GONE;
            }
        
            if ((dirtyFlags & 0b101L) != 0) {
            
                // read committer~.~commit~
                if ( commit != null) {
                    committerCommit = commit.committer;
                }
            
            
                // read login~.~committer~.~commit~
                if ( committerCommit != null) {
                    loginCommitterCommit = committerCommit.login;
                }
            }
        
            if ((dirtyFlags & 0b101L) != 0) {
            
                // read sha~.~commit~
                if ( commit != null) {
                    shaCommit = commit.sha;
                }
            
            
                // read sha~.~commit~~substring~sha~.~commit~~int0~int6
                if ( shaCommit != null) {
                    shaCommitSubstringShaCommitInt0Int6 = shaCommit.substring(0,6);
                }
            
            
                // read @android:string/sha~~+~sha~.~commit~~substring~sha~.~commit~~int0~int6
                AndroidStringShaShaCommitSubstringShaCommitInt0Int6 = getRoot().getResources().getString(R.string.sha)+shaCommitSubstringShaCommitInt0Int6;
            }
        }
    
        if ((dirtyFlags & 0b111L) != 0) {
        
        
        
            // read dateFormat~~format~dateFormat~~date~.~committer~.~commit~.~commit~
            if ( dateFormat != null) {
                dateFormatFormatDateFormatDateCommitterCommitCommit = dateFormat.format(dateCommitterCommitCommit);
            }
        }
        // batch finished
        if ((dirtyFlags & 0b101L) != 0) {
            // api target 1
            this.tvCommitAuthor.setText(loginCommitterCommit);
        }
        if ((dirtyFlags & 0b111L) != 0) {
            // api target 1
            this.tvCommitData.setText(dateFormatFormatDateFormatDateCommitterCommitCommit);
        }
        if ((dirtyFlags & 0b101L) != 0) {
            // api target 1
            this.tvCommitData.setVisibility(DateCommitterCommitCommitObjectnullVISIBLEViewGONEView);
        }
        if ((dirtyFlags & 0b101L) != 0) {
            // api target 1
            this.tvCommitEmail.setText(nameCommitterCommitCommit);
        }
        if ((dirtyFlags & 0b101L) != 0) {
            // api target 1
            this.tvCommitEmail.setVisibility(LogicalNotTextUtilsIsEmptyTextUtilsNameCommitterCommitCommitVISIBLEViewGONEView);
        }
        if ((dirtyFlags & 0b101L) != 0) {
            // api target 1
            this.tvCommitMessage.setText(messageCommitCommit);
        }
        if ((dirtyFlags & 0b101L) != 0) {
            // api target 1
            this.tvDetailRepoForkedSource.setText(AndroidStringShaShaCommitSubstringShaCommitInt0Int6);
        }
    }
    // Listener Stub Implementations
    // dirty flag
    private  long mDirtyFlags = 0b1111111111111111111111111111111111111111111111111111111111111111L;
    
    public static ElementCommitBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return android.databinding.DataBindingUtil.<ElementCommitBinding>inflate(inflater, com.e.legion.test.app.R.layout.element_commit, root, attachToRoot);
    }
    public static ElementCommitBinding inflate(android.view.LayoutInflater inflater) {
        return bind(inflater.inflate(com.e.legion.test.app.R.layout.element_commit, null, false));
    }
    public static ElementCommitBinding bind(android.view.View view) {
        if (!"layout/element_commit_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ElementCommitBinding(view);
    }
}
    /* flag mapping
        flag 0: commit~
        flag 1: dateFormat~
        flag 2: INVALIDATE ANY
        flag 3: ?:logicalNot~TextUtils~~isEmpty~TextUtils~~name~.~committer~.~commit~.~commit~~VISIBLE~.~View~~GONE~.~View~== false
        flag 4: ?:logicalNot~TextUtils~~isEmpty~TextUtils~~name~.~committer~.~commit~.~commit~~VISIBLE~.~View~~GONE~.~View~== true
        flag 5: ?:!=~date~.~committer~.~commit~.~commit~~Objectnull~VISIBLE~.~View~~GONE~.~View~== false
        flag 6: ?:!=~date~.~committer~.~commit~.~commit~~Objectnull~VISIBLE~.~View~~GONE~.~View~== true
    flag mapping end*/
    //end
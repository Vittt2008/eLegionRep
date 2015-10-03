package com.e.legion.test.app.databinding;
import com.e.legion.test.app.R;
import com.e.legion.test.app.BR;
import android.view.View;
public class ElementRepoBinding extends android.databinding.ViewDataBinding {
    
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.ImageView ivPrivate;
    private final android.support.v7.widget.CardView mboundView0;
    private final android.view.View mboundView5;
    public final com.e.legion.test.app.controls.GitHubTextView tvFork;
    public final android.widget.TextView tvRepoDescription;
    public final android.widget.TextView tvRepoFullname;
    public final android.widget.TextView tvRepoName;
    // variables
    private com.e.legion.test.app.entities.Repo mRepo;
    // values
    // listeners
    
    public ElementRepoBinding(View root) {
        super(root, 0);
        final Object[] bindings = mapBindings(root, 7, sIncludes, sViewsWithIds);
        this.ivPrivate = (android.widget.ImageView) bindings[2];
        this.ivPrivate.setTag(null);
        this.mboundView0 = (android.support.v7.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView5 = (android.view.View) bindings[5];
        this.mboundView5.setTag(null);
        this.tvFork = (com.e.legion.test.app.controls.GitHubTextView) bindings[3];
        this.tvFork.setTag(null);
        this.tvRepoDescription = (android.widget.TextView) bindings[6];
        this.tvRepoDescription.setTag(null);
        this.tvRepoFullname = (android.widget.TextView) bindings[4];
        this.tvRepoFullname.setTag(null);
        this.tvRepoName = (android.widget.TextView) bindings[1];
        this.tvRepoName.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
    
    @Override
    public void invalidateAll() {
        synchronized(this) {
            mDirtyFlags = 0b10L;
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
            case BR.repo :
                setRepo((com.e.legion.test.app.entities.Repo) variable);
                return true;
        }
        return false;
    }
    
    public void setRepo(com.e.legion.test.app.entities.Repo repo) {
        this.mRepo = repo;
        synchronized(this) {
            mDirtyFlags |= 0b1L;
        }
        super.requestRebind();
    }
    public com.e.legion.test.app.entities.Repo getRepo() {
        return mRepo;
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
        java.lang.String descriptionRepo = null;
        boolean forkRepo = false;
        boolean TextUtilsIsEmptyTextUtilsDescriptionRepo = false;
        boolean isPrivateRepo = false;
        int ForkRepoVISIBLEViewGONEView = 0;
        java.lang.String nameRepo = null;
        java.lang.String fullNameRepo = null;
        android.graphics.drawable.Drawable IsPrivateRepoAndroidDrawableIcPrivateAndroidDrawableIcNotPrivate = null;
        int TextUtilsIsEmptyTextUtilsDescriptionRepoGONEViewVISIBLEView = 0;
        com.e.legion.test.app.entities.Repo repo = mRepo;
    
        if ((dirtyFlags & 0b11L) != 0) {
        
        
        
            // read description~.~repo~
            if ( repo != null) {
                descriptionRepo = repo.description;
            }
        
        
            // read TextUtils~~isEmpty~TextUtils~~description~.~repo~
            TextUtilsIsEmptyTextUtilsDescriptionRepo = android.text.TextUtils.isEmpty(descriptionRepo);
            // setting conditional flags
            if (TextUtilsIsEmptyTextUtilsDescriptionRepo) {
                dirtyFlags |= 0b10000000L;
            } else {
                dirtyFlags |= 0b1000000L;
            }
        
        
            // read ?:TextUtils~~isEmpty~TextUtils~~description~.~repo~~GONE~.~View~~VISIBLE~.~View~
            TextUtilsIsEmptyTextUtilsDescriptionRepoGONEViewVISIBLEView = TextUtilsIsEmptyTextUtilsDescriptionRepo ? android.view.View.GONE : android.view.View.VISIBLE;
        
        
            // read fork~.~repo~
            if ( repo != null) {
                forkRepo = repo.fork;
            }
            // setting conditional flags
            if (forkRepo) {
                dirtyFlags |= 0b1000L;
            } else {
                dirtyFlags |= 0b100L;
            }
        
        
            // read ?:fork~.~repo~~VISIBLE~.~View~~GONE~.~View~
            ForkRepoVISIBLEViewGONEView = forkRepo ? android.view.View.VISIBLE : android.view.View.GONE;
        
        
            // read is_private~.~repo~
            if ( repo != null) {
                isPrivateRepo = repo.is_private;
            }
            // setting conditional flags
            if (isPrivateRepo) {
                dirtyFlags |= 0b100000L;
            } else {
                dirtyFlags |= 0b10000L;
            }
        
        
            // read ?:is_private~.~repo~~@android:drawable/ic_private~~@android:drawable/ic_not_private~
            IsPrivateRepoAndroidDrawableIcPrivateAndroidDrawableIcNotPrivate = isPrivateRepo ? getRoot().getResources().getDrawable(R.drawable.ic_private) : getRoot().getResources().getDrawable(R.drawable.ic_not_private);
        
        
            // read name~.~repo~
            if ( repo != null) {
                nameRepo = repo.name;
            }
        
        
            // read full_name~.~repo~
            if ( repo != null) {
                fullNameRepo = repo.full_name;
            }
        }
        // batch finished
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            android.databinding.adapters.ImageViewBindingAdapter.setImageUri(this.ivPrivate, IsPrivateRepoAndroidDrawableIcPrivateAndroidDrawableIcNotPrivate);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.mboundView5.setVisibility(TextUtilsIsEmptyTextUtilsDescriptionRepoGONEViewVISIBLEView);
            // api target 1
            this.tvRepoDescription.setVisibility(TextUtilsIsEmptyTextUtilsDescriptionRepoGONEViewVISIBLEView);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvFork.setVisibility(ForkRepoVISIBLEViewGONEView);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvRepoDescription.setText(descriptionRepo);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvRepoFullname.setText(fullNameRepo);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvRepoName.setText(nameRepo);
        }
    }
    // Listener Stub Implementations
    // dirty flag
    private  long mDirtyFlags = 0b1111111111111111111111111111111111111111111111111111111111111111L;
    
    public static ElementRepoBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return android.databinding.DataBindingUtil.<ElementRepoBinding>inflate(inflater, com.e.legion.test.app.R.layout.element_repo, root, attachToRoot);
    }
    public static ElementRepoBinding inflate(android.view.LayoutInflater inflater) {
        return bind(inflater.inflate(com.e.legion.test.app.R.layout.element_repo, null, false));
    }
    public static ElementRepoBinding bind(android.view.View view) {
        if (!"layout/element_repo_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ElementRepoBinding(view);
    }
}
    /* flag mapping
        flag 0: repo~
        flag 1: INVALIDATE ANY
        flag 2: ?:fork~.~repo~~VISIBLE~.~View~~GONE~.~View~== false
        flag 3: ?:fork~.~repo~~VISIBLE~.~View~~GONE~.~View~== true
        flag 4: ?:is_private~.~repo~~@android:drawable/ic_private~~@android:drawable/ic_not_private~== false
        flag 5: ?:is_private~.~repo~~@android:drawable/ic_private~~@android:drawable/ic_not_private~== true
        flag 6: ?:TextUtils~~isEmpty~TextUtils~~description~.~repo~~GONE~.~View~~VISIBLE~.~View~== false
        flag 7: ?:TextUtils~~isEmpty~TextUtils~~description~.~repo~~GONE~.~View~~VISIBLE~.~View~== true
    flag mapping end*/
    //end
package com.e.legion.test.app.databinding;
import com.e.legion.test.app.R;
import com.e.legion.test.app.BR;
import android.view.View;
public class HeaderRepoDetailBinding extends android.databinding.ViewDataBinding {
    
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_author_photo, 10);
    }
    // views
    public final android.widget.ImageView ivAuthorPhoto;
    private final android.support.v7.widget.CardView mboundView0;
    private final android.widget.TableRow mboundView5;
    public final com.e.legion.test.app.controls.MarqueeTextView tvDetailRepoForked;
    public final com.e.legion.test.app.controls.MarqueeTextView tvDetailRepoForkedSource;
    public final com.e.legion.test.app.controls.MarqueeTextView tvDetailRepoFullname;
    public final com.e.legion.test.app.controls.MarqueeTextView tvDetailRepoName;
    public final android.widget.TextView tvRepoDetailDescription;
    public final com.e.legion.test.app.controls.GitHubTextView tvRepoFork;
    public final com.e.legion.test.app.controls.GitHubTextView tvRepoStar;
    public final com.e.legion.test.app.controls.GitHubTextView tvRepoWatch;
    // variables
    private com.e.legion.test.app.entities.Repo mRepo;
    // values
    // listeners
    
    public HeaderRepoDetailBinding(View root) {
        super(root, 0);
        final Object[] bindings = mapBindings(root, 11, sIncludes, sViewsWithIds);
        this.ivAuthorPhoto = (android.widget.ImageView) bindings[10];
        this.mboundView0 = (android.support.v7.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView5 = (android.widget.TableRow) bindings[5];
        this.mboundView5.setTag(null);
        this.tvDetailRepoForked = (com.e.legion.test.app.controls.MarqueeTextView) bindings[3];
        this.tvDetailRepoForked.setTag(null);
        this.tvDetailRepoForkedSource = (com.e.legion.test.app.controls.MarqueeTextView) bindings[4];
        this.tvDetailRepoForkedSource.setTag(null);
        this.tvDetailRepoFullname = (com.e.legion.test.app.controls.MarqueeTextView) bindings[2];
        this.tvDetailRepoFullname.setTag(null);
        this.tvDetailRepoName = (com.e.legion.test.app.controls.MarqueeTextView) bindings[1];
        this.tvDetailRepoName.setTag(null);
        this.tvRepoDetailDescription = (android.widget.TextView) bindings[9];
        this.tvRepoDetailDescription.setTag(null);
        this.tvRepoFork = (com.e.legion.test.app.controls.GitHubTextView) bindings[8];
        this.tvRepoFork.setTag(null);
        this.tvRepoStar = (com.e.legion.test.app.controls.GitHubTextView) bindings[7];
        this.tvRepoStar.setTag(null);
        this.tvRepoWatch = (com.e.legion.test.app.controls.GitHubTextView) bindings[6];
        this.tvRepoWatch.setTag(null);
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
        int starsRepo = 0;
        java.lang.String AndroidStringForkSymbolFullNameParentRepo = null;
        boolean TextUtilsIsEmptyTextUtilsFullNameSourceRepo = false;
        java.lang.String AndroidStringWatchWatchesRepo = null;
        java.lang.String descriptionRepo = null;
        int watchesRepo = 0;
        java.lang.String AndroidStringForkForksRepo = null;
        boolean logicalNotTextUtilsIsEmptyTextUtilsFullNameRepo = false;
        com.e.legion.test.app.entities.Repo sourceRepo = null;
        boolean fullNameParentRepoEqualsIgnoreCaseFullNameParentRepoFullNameSourceRepo = false;
        boolean TextUtilsIsEmptyTextUtilsFullNameParentRepo = false;
        java.lang.String AndroidStringStarStarsRepo = null;
        java.lang.String fullNameSourceRepo = null;
        int TextUtilsIsEmptyTextUtilsFullNameSourceRepoBooleantrueFullNameParentRepoEqualsIgnoreCaseFullNameParentRepoFullNameSourceRepoGONEViewVISIBLEView = 0;
        com.e.legion.test.app.entities.Repo parentRepo = null;
        boolean RepoObjectnull = false;
        int LogicalNotTextUtilsIsEmptyTextUtilsFullNameRepoVISIBLEViewGONEView = 0;
        java.lang.String nameRepo = null;
        int forksRepo = 0;
        boolean TextUtilsIsEmptyTextUtilsFullNameSourceRepoBooleantrueFullNameParentRepoEqualsIgnoreCaseFullNameParentRepoFullNameSourceRepo = false;
        boolean fullNameRepoEqualsIgnoreCaseFullNameRepoFullNameParentRepo = false;
        java.lang.String fullNameParentRepo = null;
        boolean TextUtilsIsEmptyTextUtilsFullNameParentRepoBooleantrueFullNameRepoEqualsIgnoreCaseFullNameRepoFullNameParentRepo = false;
        int TextUtilsIsEmptyTextUtilsFullNameParentRepoBooleantrueFullNameRepoEqualsIgnoreCaseFullNameRepoFullNameParentRepoGONEViewVISIBLEView = 0;
        java.lang.String AndroidStringForkSymbolFullNameSourceRepo = null;
        boolean TextUtilsIsEmptyTextUtilsFullNameRepo = false;
        int RepoObjectnullVISIBLEViewGONEView = 0;
        java.lang.String fullNameRepo = null;
        com.e.legion.test.app.entities.Repo repo = mRepo;
    
        if ((dirtyFlags & 0b11L) != 0) {
        
        
        
            // read stars~.~repo~
            if ( repo != null) {
                starsRepo = repo.stars;
            }
        
        
            // read @android:string/star~~+~stars~.~repo~
            AndroidStringStarStarsRepo = getRoot().getResources().getString(R.string.star)+starsRepo;
        
        
            // read description~.~repo~
            if ( repo != null) {
                descriptionRepo = repo.description;
            }
        
        
            // read watches~.~repo~
            if ( repo != null) {
                watchesRepo = repo.watches;
            }
        
        
            // read @android:string/watch~~+~watches~.~repo~
            AndroidStringWatchWatchesRepo = getRoot().getResources().getString(R.string.watch)+watchesRepo;
        
        
            // read source~.~repo~
            if ( repo != null) {
                sourceRepo = repo.source;
            }
        
        
            // read full_name~.~source~.~repo~
            if ( sourceRepo != null) {
                fullNameSourceRepo = sourceRepo.full_name;
            }
        
        
            // read TextUtils~~isEmpty~TextUtils~~full_name~.~source~.~repo~
            TextUtilsIsEmptyTextUtilsFullNameSourceRepo = android.text.TextUtils.isEmpty(fullNameSourceRepo);
            // setting conditional flags
            if (TextUtilsIsEmptyTextUtilsFullNameSourceRepo) {
                dirtyFlags |= 0b10000000L;
            } else {
                dirtyFlags |= 0b1000000L;
            }
        
        
            // read @android:string/fork_symbol~~+~full_name~.~source~.~repo~
            AndroidStringForkSymbolFullNameSourceRepo = getRoot().getResources().getString(R.string.fork_symbol)+fullNameSourceRepo;
        
        
            // read parent~.~repo~
            if ( repo != null) {
                parentRepo = repo.parent;
            }
        
        
            // read full_name~.~parent~.~repo~
            if ( parentRepo != null) {
                fullNameParentRepo = parentRepo.full_name;
            }
        
        
            // read @android:string/fork_symbol~~+~full_name~.~parent~.~repo~
            AndroidStringForkSymbolFullNameParentRepo = getRoot().getResources().getString(R.string.fork_symbol)+fullNameParentRepo;
        
        
            // read TextUtils~~isEmpty~TextUtils~~full_name~.~parent~.~repo~
            TextUtilsIsEmptyTextUtilsFullNameParentRepo = android.text.TextUtils.isEmpty(fullNameParentRepo);
            // setting conditional flags
            if (TextUtilsIsEmptyTextUtilsFullNameParentRepo) {
                dirtyFlags |= 0b1000000000L;
            } else {
                dirtyFlags |= 0b100000000L;
            }
        
        
            // read !=~repo~~Objectnull
            RepoObjectnull = repo !=null;
            // setting conditional flags
            if (RepoObjectnull) {
                dirtyFlags |= 0b10000000000000L;
            } else {
                dirtyFlags |= 0b1000000000000L;
            }
        
        
            // read ?:!=~repo~~Objectnull~VISIBLE~.~View~~GONE~.~View~
            RepoObjectnullVISIBLEViewGONEView = RepoObjectnull ? android.view.View.VISIBLE : android.view.View.GONE;
        
        
            // read name~.~repo~
            if ( repo != null) {
                nameRepo = repo.name;
            }
        
        
            // read forks~.~repo~
            if ( repo != null) {
                forksRepo = repo.forks;
            }
        
        
            // read @android:string/fork~~+~forks~.~repo~
            AndroidStringForkForksRepo = getRoot().getResources().getString(R.string.fork)+forksRepo;
        
        
            // read full_name~.~repo~
            if ( repo != null) {
                fullNameRepo = repo.full_name;
            }
        
        
            // read TextUtils~~isEmpty~TextUtils~~full_name~.~repo~
            TextUtilsIsEmptyTextUtilsFullNameRepo = android.text.TextUtils.isEmpty(fullNameRepo);
        
        
            // read logicalNot~TextUtils~~isEmpty~TextUtils~~full_name~.~repo~
            logicalNotTextUtilsIsEmptyTextUtilsFullNameRepo = !TextUtilsIsEmptyTextUtilsFullNameRepo;
            // setting conditional flags
            if (logicalNotTextUtilsIsEmptyTextUtilsFullNameRepo) {
                dirtyFlags |= 0b100000L;
            } else {
                dirtyFlags |= 0b10000L;
            }
        
        
            // read ?:logicalNot~TextUtils~~isEmpty~TextUtils~~full_name~.~repo~~VISIBLE~.~View~~GONE~.~View~
            LogicalNotTextUtilsIsEmptyTextUtilsFullNameRepoVISIBLEViewGONEView = logicalNotTextUtilsIsEmptyTextUtilsFullNameRepo ? android.view.View.VISIBLE : android.view.View.GONE;
        }
        // batch finished
    
        if ((dirtyFlags & 0b1000000L) != 0) {
        
            // read full_name~.~parent~.~repo~~equalsIgnoreCase~full_name~.~parent~.~repo~~full_name~.~source~.~repo~
            if ( fullNameParentRepo != null) {
                fullNameParentRepoEqualsIgnoreCaseFullNameParentRepoFullNameSourceRepo = fullNameParentRepo.equalsIgnoreCase(fullNameSourceRepo);
            }
        }
    
        if ((dirtyFlags & 0b100000000L) != 0) {
        
            // read full_name~.~repo~~equalsIgnoreCase~full_name~.~repo~~full_name~.~parent~.~repo~
            if ( fullNameRepo != null) {
                fullNameRepoEqualsIgnoreCaseFullNameRepoFullNameParentRepo = fullNameRepo.equalsIgnoreCase(fullNameParentRepo);
            }
        }
    
        if ((dirtyFlags & 0b11L) != 0) {
        
            // read ?:TextUtils~~isEmpty~TextUtils~~full_name~.~source~.~repo~~booleantrue~full_name~.~parent~.~repo~~equalsIgnoreCase~full_name~.~parent~.~repo~~full_name~.~source~.~repo~
            TextUtilsIsEmptyTextUtilsFullNameSourceRepoBooleantrueFullNameParentRepoEqualsIgnoreCaseFullNameParentRepoFullNameSourceRepo = TextUtilsIsEmptyTextUtilsFullNameSourceRepo ? true : fullNameParentRepoEqualsIgnoreCaseFullNameParentRepoFullNameSourceRepo;
            // setting conditional flags
            if (TextUtilsIsEmptyTextUtilsFullNameSourceRepoBooleantrueFullNameParentRepoEqualsIgnoreCaseFullNameParentRepoFullNameSourceRepo) {
                dirtyFlags |= 0b1000L;
            } else {
                dirtyFlags |= 0b100L;
            }
        
        
            // read ?:?:TextUtils~~isEmpty~TextUtils~~full_name~.~source~.~repo~~booleantrue~full_name~.~parent~.~repo~~equalsIgnoreCase~full_name~.~parent~.~repo~~full_name~.~source~.~repo~~GONE~.~View~~VISIBLE~.~View~
            TextUtilsIsEmptyTextUtilsFullNameSourceRepoBooleantrueFullNameParentRepoEqualsIgnoreCaseFullNameParentRepoFullNameSourceRepoGONEViewVISIBLEView = TextUtilsIsEmptyTextUtilsFullNameSourceRepoBooleantrueFullNameParentRepoEqualsIgnoreCaseFullNameParentRepoFullNameSourceRepo ? android.view.View.GONE : android.view.View.VISIBLE;
        }
    
        if ((dirtyFlags & 0b11L) != 0) {
        
            // read ?:TextUtils~~isEmpty~TextUtils~~full_name~.~parent~.~repo~~booleantrue~full_name~.~repo~~equalsIgnoreCase~full_name~.~repo~~full_name~.~parent~.~repo~
            TextUtilsIsEmptyTextUtilsFullNameParentRepoBooleantrueFullNameRepoEqualsIgnoreCaseFullNameRepoFullNameParentRepo = TextUtilsIsEmptyTextUtilsFullNameParentRepo ? true : fullNameRepoEqualsIgnoreCaseFullNameRepoFullNameParentRepo;
            // setting conditional flags
            if (TextUtilsIsEmptyTextUtilsFullNameParentRepoBooleantrueFullNameRepoEqualsIgnoreCaseFullNameRepoFullNameParentRepo) {
                dirtyFlags |= 0b100000000000L;
            } else {
                dirtyFlags |= 0b10000000000L;
            }
        
        
            // read ?:?:TextUtils~~isEmpty~TextUtils~~full_name~.~parent~.~repo~~booleantrue~full_name~.~repo~~equalsIgnoreCase~full_name~.~repo~~full_name~.~parent~.~repo~~GONE~.~View~~VISIBLE~.~View~
            TextUtilsIsEmptyTextUtilsFullNameParentRepoBooleantrueFullNameRepoEqualsIgnoreCaseFullNameRepoFullNameParentRepoGONEViewVISIBLEView = TextUtilsIsEmptyTextUtilsFullNameParentRepoBooleantrueFullNameRepoEqualsIgnoreCaseFullNameRepoFullNameParentRepo ? android.view.View.GONE : android.view.View.VISIBLE;
        }
        // batch finished
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.mboundView0.setVisibility(RepoObjectnullVISIBLEViewGONEView);
            // api target 1
            this.mboundView5.setVisibility(RepoObjectnullVISIBLEViewGONEView);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvDetailRepoForked.setText(AndroidStringForkSymbolFullNameParentRepo);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvDetailRepoForked.setVisibility(TextUtilsIsEmptyTextUtilsFullNameParentRepoBooleantrueFullNameRepoEqualsIgnoreCaseFullNameRepoFullNameParentRepoGONEViewVISIBLEView);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvDetailRepoForkedSource.setText(AndroidStringForkSymbolFullNameSourceRepo);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvDetailRepoForkedSource.setVisibility(TextUtilsIsEmptyTextUtilsFullNameSourceRepoBooleantrueFullNameParentRepoEqualsIgnoreCaseFullNameParentRepoFullNameSourceRepoGONEViewVISIBLEView);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvDetailRepoFullname.setText(fullNameRepo);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvDetailRepoFullname.setVisibility(LogicalNotTextUtilsIsEmptyTextUtilsFullNameRepoVISIBLEViewGONEView);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvDetailRepoName.setText(nameRepo);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvRepoDetailDescription.setText(descriptionRepo);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvRepoFork.setText(AndroidStringForkForksRepo);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvRepoStar.setText(AndroidStringStarStarsRepo);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvRepoWatch.setText(AndroidStringWatchWatchesRepo);
        }
    }
    // Listener Stub Implementations
    // dirty flag
    private  long mDirtyFlags = 0b1111111111111111111111111111111111111111111111111111111111111111L;
    
    public static HeaderRepoDetailBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return android.databinding.DataBindingUtil.<HeaderRepoDetailBinding>inflate(inflater, com.e.legion.test.app.R.layout.header_repo_detail, root, attachToRoot);
    }
    public static HeaderRepoDetailBinding inflate(android.view.LayoutInflater inflater) {
        return bind(inflater.inflate(com.e.legion.test.app.R.layout.header_repo_detail, null, false));
    }
    public static HeaderRepoDetailBinding bind(android.view.View view) {
        if (!"layout/header_repo_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new HeaderRepoDetailBinding(view);
    }
}
    /* flag mapping
        flag 0: repo~
        flag 1: INVALIDATE ANY
        flag 2: ?:?:TextUtils~~isEmpty~TextUtils~~full_name~.~source~.~repo~~booleantrue~full_name~.~parent~.~repo~~equalsIgnoreCase~full_name~.~parent~.~repo~~full_name~.~source~.~repo~~GONE~.~View~~VISIBLE~.~View~== false
        flag 3: ?:?:TextUtils~~isEmpty~TextUtils~~full_name~.~source~.~repo~~booleantrue~full_name~.~parent~.~repo~~equalsIgnoreCase~full_name~.~parent~.~repo~~full_name~.~source~.~repo~~GONE~.~View~~VISIBLE~.~View~== true
        flag 4: ?:logicalNot~TextUtils~~isEmpty~TextUtils~~full_name~.~repo~~VISIBLE~.~View~~GONE~.~View~== false
        flag 5: ?:logicalNot~TextUtils~~isEmpty~TextUtils~~full_name~.~repo~~VISIBLE~.~View~~GONE~.~View~== true
        flag 6: ?:TextUtils~~isEmpty~TextUtils~~full_name~.~source~.~repo~~booleantrue~full_name~.~parent~.~repo~~equalsIgnoreCase~full_name~.~parent~.~repo~~full_name~.~source~.~repo~== false
        flag 7: ?:TextUtils~~isEmpty~TextUtils~~full_name~.~source~.~repo~~booleantrue~full_name~.~parent~.~repo~~equalsIgnoreCase~full_name~.~parent~.~repo~~full_name~.~source~.~repo~== true
        flag 8: ?:TextUtils~~isEmpty~TextUtils~~full_name~.~parent~.~repo~~booleantrue~full_name~.~repo~~equalsIgnoreCase~full_name~.~repo~~full_name~.~parent~.~repo~== false
        flag 9: ?:TextUtils~~isEmpty~TextUtils~~full_name~.~parent~.~repo~~booleantrue~full_name~.~repo~~equalsIgnoreCase~full_name~.~repo~~full_name~.~parent~.~repo~== true
        flag 10: ?:?:TextUtils~~isEmpty~TextUtils~~full_name~.~parent~.~repo~~booleantrue~full_name~.~repo~~equalsIgnoreCase~full_name~.~repo~~full_name~.~parent~.~repo~~GONE~.~View~~VISIBLE~.~View~== false
        flag 11: ?:?:TextUtils~~isEmpty~TextUtils~~full_name~.~parent~.~repo~~booleantrue~full_name~.~repo~~equalsIgnoreCase~full_name~.~repo~~full_name~.~parent~.~repo~~GONE~.~View~~VISIBLE~.~View~== true
        flag 12: ?:!=~repo~~Objectnull~VISIBLE~.~View~~GONE~.~View~== false
        flag 13: ?:!=~repo~~Objectnull~VISIBLE~.~View~~GONE~.~View~== true
    flag mapping end*/
    //end
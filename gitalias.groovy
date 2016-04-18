#!/usr/bin/env groovy

'git config --local alias.move checkout'.execute()
['git', 'config', '--global', 'alias.unstash', 'stash pop'].execute()
['git', 'config', '--global', 'alias.tree', 'log --graph --oneline --decorate'].execute()
